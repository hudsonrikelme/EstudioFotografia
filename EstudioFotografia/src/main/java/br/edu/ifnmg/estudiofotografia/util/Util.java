package br.edu.ifnmg.estudiofotografia.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Rikelme
 */
public class Util {

    public static boolean isCpfValido(Long cpf) {
        if (cpf == 00000000000l || cpf == 11111111111l
                || cpf == 22222222222l || cpf == 33333333333l
                || cpf == 44444444444l || cpf == 55555555555l
                || cpf == 66666666666l || cpf == 77777777777l
                || cpf == 88888888888l || cpf == 99999999999l) {

            return false;
        }

        byte digito10 = (byte) ((cpf / Math.pow(10, 1)) % 10);
        byte digito11 = (byte) ((cpf / Math.pow(10, 0)) % 10);

        return (obterDigito(cpf, 2) == digito10
                && obterDigito(cpf, 1) == digito11);
    }

    public static byte obterDigito(Long cpf, int posicao)
            throws IllegalArgumentException {
        if (posicao != 2 && posicao != 1) {
            throw new IllegalArgumentException("Posição Inválida");
        }

        int soma = 0;
        byte peso = 2;
        byte digito;

        for (int i = posicao + 1; i < 12; i++) {

            soma += (int) ((cpf / Math.pow(10, i - 1)) % 10) * peso;

            peso += 1;
        }

        int r = 11 - (soma % 11);

        digito = (r == 10 || r == 11) ? 0 : (byte) r;

        return digito;
    }

    public static LocalDate convertDateToLocalDate(Date data) {

        if (data == null) {
            return LocalDate.now();
        }

        return new Date(data.getTime())
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

//        return data.toInstant()
//                .atZone(ZoneId.systemDefault())
//                .toLocalDate();
    }

    /**
     * Realiza a conversão de um objeto do tipo Date para um objeto do tipo
     * LocalDateTime.
     *
     * @param data Objeto do tipo Date a ser convertido para LocalDateTime
     * @return Objeto LocalDateTime correspondente ao Date.
     */
    public static LocalDateTime convertDateToLocalDateTime(Date data) {

        if (data == null) {
            return LocalDateTime.now();
        }

        return new Date(data.getTime())
                .toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();

//        return data.toInstant()
//                .atZone(ZoneId.systemDefault())
//                .toLocalDateTime();
    }

    public static String formatarData(LocalDateTime data) {
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

}
