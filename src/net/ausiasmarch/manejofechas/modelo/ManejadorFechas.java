package net.ausiasmarch.manejofechas.modelo;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * ManejadorFechas.java
 *
 * @author Hector
 */
public class ManejadorFechas {

    private static final Locale locale = new Locale("es", "ES");

    /**
     * Metodos para obtener la fecha, incluido el dia de la semana
     *
     * @param ldt
     * @return
     */
    public static int getDiaMes(LocalDateTime ldt) {
        return ldt.getDayOfMonth();
    }

    /**
     * 
     * @param ldt
     * @return 
     */
    public static int getDiaMes(LocalDate ldt) {
        return ldt.getDayOfMonth();
    }

    /**
     *
     * @param ldt
     * @return
     */
    public static String getDiaWeek(LocalDateTime ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }
     public static String getDiaWeekShort(LocalDateTime ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.SHORT, locale);
    }
    /**
     *
     * @param ldt
     * @return
     */
    public static String getDiaWeek(LocalDate ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.FULL, locale);
    }
public static String getDiaWeekshort(LocalDate ldt) {
        return ldt.getDayOfWeek().getDisplayName(TextStyle.SHORT, locale);
    }
    /**
     *
     * @param ldt
     * @return
     */
    public static String getMes(LocalDateTime ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.FULL,locale);
    }
    
    public static String getMesCorto(LocalDateTime ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.SHORT,locale);
    }
    
    public static String getMesShort(LocalDate ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.SHORT, locale);
    }
    
    public static String getMeslargo(LocalDate ldt) {
        return ldt.getMonth().getDisplayName(TextStyle.FULL, locale);
    }
    
    /**
     *
     * @param ldt
     * @return
     */
    public static int getMes(LocalDate ldt) {
        return ldt.getMonthValue();
    }

    /**
     *
     * @param ldt
     * @return
     */
    public static int getAnyo(LocalDateTime ldt) {
        return ldt.getYear();
    }

    /**
     *
     * @param ldt
     * @return
     */
    public static int getAnyo(LocalDate ldt) {
        return ldt.getYear();
    }

    /**
     *
     * @param ldt
     * @return
     */
    public static int getHora(LocalDateTime ldt) {
        return ldt.getHour();
    }

    /**
     *
     * @param ldt
     * @return
     */
    public static int getMinutos(LocalDateTime ldt) {
        return ldt.getMinute();
    }

    /**
     *
     * @param ldt
     * @return
     */
    public static int getSegundos(LocalDateTime ldt) {
        return ldt.getSecond();
    }

    /**
     * Obtiene la hora actual
     *
     * @param ahora
     * @return
     */
    public static String fechaAhora(String ahora) {
        DateTimeFormatter zonaHoraria = DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm a");
        ahora = ZonedDateTime.now().format(zonaHoraria);
        return ahora;
    }

    /**
     *
     * @param ldt
     * @param valor
     * @return
     */
    //Metodos para sumar y restar a una fecha
    public static LocalDateTime sumaDia(LocalDateTime ldt, int valor) {
        return ldt.plusDays(valor);
    }

    /**
     *
     * @param ld
     * @param valor
     * @return
     */
    public static LocalDate sumaDia(LocalDate ld, int valor) {
        return ld.plusDays(valor);
    }

    /**
     *
     * @param ld
     * @param valor
     * @return
     */
    public static LocalDateTime sumaMes(LocalDateTime ld, int valor) {
        return ld.plusMonths(valor);
    }

    /**
     *
     * @param ld
     * @param valor
     * @return
     */
    public static LocalDate sumaMes(LocalDate ld, int valor) {
        return ld.plusMonths(valor);
    }

    /**
     *
     * @param ld
     * @param valor
     * @return
     */
    public static LocalDateTime sumaAño(LocalDateTime ld, int valor) {
        return ld.plusYears(valor);
    }

    /**
     *
     * @param ld
     * @param valor
     * @return
     */
    public static LocalDate sumaAño(LocalDate ld, int valor) {
        return ld.plusYears(valor);
    }

    /**
     *
     * @param ld
     * @param valor
     * @return
     */
    public static LocalDateTime restaDia(LocalDateTime ld, int valor) {
        return ld.minusDays(valor);
    }

    /**
     *
     * @param ld
     * @param valor
     * @return
     */
    public static LocalDate restaDia(LocalDate ld, int valor) {
        return ld.minusDays(valor);
    }

    /**
     *
     * @param ld
     * @param valor
     * @return
     */
    public static LocalDateTime restaMes(LocalDateTime ld, int valor) {
        return ld.minusMonths(valor);
    }

    /**
     *
     * @param ld
     * @param valor
     * @return
     */
    public static LocalDate restaMes(LocalDate ld, int valor) {
        return ld.minusMonths(valor);
    }

    /**
     *
     * @param ld
     * @param valor
     * @return
     */
    public static LocalDateTime restaAño(LocalDateTime ld, int valor) {
        return ld.minusYears(valor);
    }

    /**
     *
     * @param ld
     * @param valor
     * @return
     */
    public static LocalDate restaAño(LocalDate ld, int valor) {
        return ld.minusYears(valor);
    }

    /**
     *
     * @param sum
     * @param sumatorio
     * @param sumador
     * @return
     */
    public static LocalDate sumas(LocalDate sum, int sumatorio, String sumador) {

        if (sumador.equals("Dias")) {

            sum = sumaDia(sum,sumatorio);

        } else if (sumador.equals("Meses")) {
            sum = sumaMes(sum,sumatorio);
        } else if (sumador.equals("Años")) {
            sum = sumaAño(sum,sumatorio);
        }
        return sum;
    }

    /**
     *
     * @param res
     * @param restado
     * @param rest
     * @return
     */
    public static LocalDate restas(LocalDate res, int restado, String rest) {

        if (rest.equals("Dias")) {

            res = restaDia(res,restado);

        } else if (rest.equals("Meses")) {
            res = restaMes(res,restado);
        } else if (rest.equals("Años")) {
            res = restaAño(res,restado);
        }
        return res;
    }

}
