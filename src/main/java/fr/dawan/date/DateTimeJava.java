package fr.dawan.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeJava {
    public static void main(String[] args) {
        System.out.println(" API JAVA.TIME - Gestion des données temporelles");

        /*
        LocalDate ------------------

        --------------------

        Represente une date sans heure ni fuseau horaire
        Format : YYYY-MM-DD (Exemple : 2024-01-15)

         */

        LocalDate ajrd = LocalDate.now();
        System.out.println("Date actuelle : " + ajrd);

        LocalDate dateSpecifique = LocalDate.of(2024, 1, 15);
        System.out.println("Date Specifique : " + dateSpecifique);

        LocalDate dateDepuisString = LocalDate.parse("2024-12-25");
        System.out.println(dateDepuisString);

        System.out.println("--- Accès aux composants de LocalDate ------");

        int annee = ajrd.getYear();
        int mois = dateSpecifique.getMonthValue(); // 1 - 12
        Month moisEnum = ajrd.getMonth(); // Enum month
        int jour = ajrd.getDayOfMonth();
        DayOfWeek jourSemaine = ajrd.getDayOfWeek();
        System.out.println(annee);
        System.out.println(mois);
        System.out.println(jour);
        System.out.println(jourSemaine);
        System.out.println(moisEnum);

        System.out.println("===========Manipulation de date==============");
        System.out.println(" + 10 jours " + ajrd.plusDays(10));
        System.out.println(" + 2 mois "+ajrd.plusMonths(2));
        System.out.println("+ 1an "+ajrd.plusYears(1));

        // A l'inverse, le minus existe egalement
        System.out.println("Chainage : "+ajrd.plusYears(2).minusMonths(6).minusDays(19));

        System.out.println("------ 4. Comparaison de LocalDate ----------");
        System.out.println(ajrd + " est avant " + dateSpecifique + " ? " + ajrd.isBefore(dateSpecifique));
        System.out.println(ajrd + " est apres " + dateSpecifique + " ? " + ajrd.isAfter(dateSpecifique));
        System.out.println(ajrd + " est egal a " + dateSpecifique + " ? " + ajrd.isEqual(dateSpecifique));

        System.out.println("LocalTime - Gestion des heures");

        //Cela représente les heures sans date ni fuseau horaire

        LocalTime maintenant = LocalTime.now();
        System.out.println("Heure actuelle : "+maintenant);

        LocalTime heureSpecifique = LocalTime.of(14, 30);
        System.out.println(heureSpecifique);

        System.out.println("Manipulation de LocalTime");

        System.out.println("+2h - "+maintenant.plusHours(2));
        //Meme fonctionnement que LocalDate mais avec le vocabulaire du "Temps" en anglais

        System.out.println("======== LocalDateTime ==========");

        //Représente Date + Heure sans fuseau horaire

        LocalDateTime maintenantDT = LocalDateTime.now();
        System.out.println(maintenantDT);

        //Formatter l'heure et date
        System.out.println(DateTimeFormatter.ofPattern("EEEE d MMMMM yyyy HH:mm", Locale.ENGLISH).format(maintenantDT));

        LocalDate date3 = LocalDate.of(2024, 1, 15);
        LocalTime heure3 = LocalTime.of(14,30);

        LocalDateTime dateHeure = LocalDateTime.of(date3, heure3);

        //Extraire la date
        LocalDate dateExtraite = maintenantDT.toLocalDate();
        //Extraire l'heure
        LocalTime timeExtrait = maintenantDT.toLocalTime();

        System.out.println(" ============ ZonedDateTime ============== Avec fuseau horaire");

        System.out.println("--------- 1. Creation de ZonedDateTime");

        ZonedDateTime maintenantZoned = ZonedDateTime.now();
        System.out.println("Maintenant (Avec fuseau) "+maintenantZoned);

        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(ZonedDateTime.now(tokyo));

        //Same time at different zone
        ZonedDateTime tokyoTime = ZonedDateTime.now(tokyo);
        System.out.println(tokyoTime.withZoneSameInstant(ZoneId.of("Europe/Paris")));


        System.out.println("---- Partie 5 - Instant -----");

        Instant maintenantInstant = Instant.now();
        System.out.println(maintenantInstant.getEpochSecond());

    }
}
