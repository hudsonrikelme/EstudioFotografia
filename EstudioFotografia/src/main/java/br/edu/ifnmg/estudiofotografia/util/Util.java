package br.edu.ifnmg.estudiofotografia.util;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Rikelme
 */
public class Util {
    public static boolean isCpfValido(Long cpf) {

        return true;
    }
     public static byte obterDigito(Long numero, int posicao)
            throws IllegalArgumentException {
        
        return 0;
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
    
}
