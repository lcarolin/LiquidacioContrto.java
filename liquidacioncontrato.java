public class liquidacioncontrato {
    public static void main(String[] args) {
        // Definir y almacenar la información de la liquidación del contrato
        String periodo = "01/01/2024 al 01/01/2024";
        int diasLaborados = 30;
        double salarioDiario = 100000; // Ejemplo de salario diario en pesos colombianos
        double salarioMensualizado = salarioDiario * 30; // Ejemplo de cálculo del salario mensualizado
        double auxilioTransporte = 106454; // Ejemplo de auxilio de transporte en pesos colombianos
        double primaPrimerSemestre = 500000; // Ejemplo de prima del primer semestre
        double primaSegundoSemestre = 600000; // Ejemplo de prima del segundo semestre
        double cesantias = 800000; // Ejemplo de cesantías
        double interesesCesantias = 20000; // Ejemplo de intereses sobre cesantías
        double vacaciones = 400000; // Ejemplo de pago de vacaciones
        double totalPrestaciones = primaPrimerSemestre + primaSegundoSemestre + cesantias + interesesCesantias
                + vacaciones;
        double aportesSeguridadSocial = 150000; // Ejemplo de aportes a la seguridad social

        System.out.println("DATOS LIQUIDACIÓN");
        System.out.println("Periodo: " + periodo);
        System.out.println("Días Laborados (mensualizado): " + diasLaborados);
        System.out.println("Salario Diario: $" + salarioDiario);
        System.out.println("Salario Mensualizado: $" + salarioMensualizado);
        System.out.println("Auxilio de Transporte: $" + auxilioTransporte);
        System.out.println("PRESTACIONES SOCIALES EN LA LIQUIDACIÓN DEL CONTRATO DE TRABAJO");
        System.out.println("Prima primer semestre: $" + primaPrimerSemestre);
        System.out.println("Prima segundo semestre: $" + primaSegundoSemestre);
        System.out.println("Cesantías: $" + cesantias);
        System.out.println("Intereses sobre cesantías: $" + interesesCesantias);
        System.out.println("Vacaciones: $" + vacaciones);
        System.out.println("TOTAL: $" + totalPrestaciones);
        System.out.println("APORTES A LA SEGURIDAD SOCIAL (Valor mensual)");
        System.out.println("Pensiones (AFP): $" + aportesSeguridadSocial);
    }
}
