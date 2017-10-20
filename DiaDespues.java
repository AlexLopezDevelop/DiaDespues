import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DiaDespues {

	public static void main(String[] args) {
		try {

			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Dia de despues");

			System.out.println("Dia");
			String dia1 = buffer.readLine();
			int dia = Integer.parseInt(dia1);

			System.out.println("Mes");
			String mes1 = buffer.readLine();
			int mes = Integer.parseInt(mes1);

			System.out.println("Año");
			String anio1 = buffer.readLine();
			int anio = Integer.parseInt(anio1);

			int error=0;
			
			if (dia > 0 && dia <= 31 && mes > 0 && mes < 13 && anio > 0) {
				if (mes == 12 && dia == 31) {
					dia = 1;
					mes = 1;
					anio++;
				} else if (mes == 2) {
					if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
						if (dia == 29) {
							dia = 1;
							mes++;
						} else {
							dia++;
						}
					} else {
						if (dia == 28) {
							dia = 1;
							mes++;
						} else if(dia < 28) {
							dia++;
						}else error++;
					}
				}
				else if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
					if (dia == 31) {
						dia = 1;
						mes++;
					} else {
						dia++;
					}
				}
				else if(mes==2 || mes==4 || mes==6 || mes==9 || mes==11 && mes<=30){
				
					if (dia == 30) {
						dia = 1;
						mes++;
					} else if(dia <= 30){
						dia++;
					}
					else error++;
				}
				
				
			}
			else error++;
			
		
			if(error>=1)System.out.println("error");
			
			if(error!=1){
				System.out.println("El proximo dia sera: "+dia+"/"+mes+"/"+anio);
			
			}
			
			
		} catch (

		Exception e) {

			System.out.println("Error al introducir Datos");
		}
	}
}
