package es.upm.miw.iwvg_devops.code;

import org.apache.logging.log4j.LogManager;

import java.util.stream.Stream;

public class Searches {

    public Fraction findFractionMultiplicationByUserFamilyName(String familyName) {
        return new UsersDatabase().findAll()
                .filter(user -> familyName.equals(user.getFamilyName()))
                .flatMap(user -> user.getFractions().stream())
                .peek(x -> LogManager.getLogger(this.getClass()).info("Fraction: " + x.getNumerator() + " / " + x.getDenominator()))
                .reduce(Fraction::multiply).orElse(new Fraction(0,0));
    }

    public Stream<String> findUserFamilyNameByImproperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(Fraction::isImproper))
                .map(User::getFamilyName)
                .distinct()
                .peek(x -> LogManager.getLogger(this.getClass()).info("Family name: " + x));
    }

    public Stream<String> findUserNameByAnyImproperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(Fraction::isImproper))
                .map(User::getName)
                .distinct()
                .peek(x -> LogManager.getLogger(this.getClass()).info("User name: " + x));
    }

    public Stream<Double> findDecimalFractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream())
                .map(Fraction::decimal)
                .peek(x -> LogManager.getLogger(this.getClass()).info("Decimal: " + x));
    }

}
