package br.com.justseries.model;

public class ConversorUtil {
    // Converte String para Double. Retorna 0.0 se for nula, vazia ou inválida.
    public static Double parseDoubleOrZero(String valor) {
        if (valor != null && !valor.isBlank()) {
            try {
                return Double.parseDouble(valor.trim());
            } catch (NumberFormatException e) {
                // Você pode logar o erro se quiser
            }
        }
        return 0.0;
    }

    // Converte String para Integer. Retorna 0 se for nula, vazia ou inválida.
    public static Integer parseIntOrZero(String valor) {
        if (valor != null && !valor.isBlank()) {
            try {
                return Integer.parseInt(valor.trim());
            } catch (NumberFormatException e) {
                // Você pode logar o erro se quiser
            }
        }
        return 0;
    }

    // Se valor for null, retorna 0. Usado para valores que já são Integer.
    public static Integer parseIntOrZero(Integer valor) {
        return (valor != null) ? valor : 0;
    }

    // Se valor for null, retorna 0.0. Usado para valores que já são Double.
    public static Double parseDoubleOrZero(Double valor) {
        return (valor != null) ? valor : 0.0;
    }

    // Se a string for null ou vazia, retorna o valor padrão informado.
    public static String parseStringOrDefault(String valor, String padrao) {
        return (valor != null && !valor.isBlank()) ? valor.trim() : padrao;
    }
}
