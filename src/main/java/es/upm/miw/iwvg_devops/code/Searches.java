package es.upm.miw.iwvg_devops.code;

import org.apache.logging.log4j.LogManager;

public class Searches {

    public Fraction findFractionMultiplicationByUserFamilyName(String familyName) {
        return new UsersDatabase().findAll()
                .filter(user -> familyName.equals(user.getFamilyName()))
                .flatMap(user -> user.getFractions().stream())
                .peek(x -> LogManager.getLogger(this.getClass()).info("Fraction: " + x.getNumerator() + " / " + x.getDenominator()))
                .reduce(Fraction::multiply).orElse(new Fraction(0,0));
    }
}
