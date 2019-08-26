package com.senati.pdw04;

public class ImplementaCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crear un objeto Celular d ela clase Celular
		//Clase objeto = new Clse(1,"Huawey",900f)
		//Clase objeto = new Clase();
		//objeto.id=1;
		//objeto.marca="Huawey";
		//objeto.precio=900;
		Celular Cel1 = new Celular();
		Cel1.id=1;
		Cel1.modelo="Venus 2019";
		Cel1.precio=900f;
		
		System.out.println("Datos registrados");
		System.out.println(Cel1.toString());
		
		//Crea un objeto Cel2 y agrega su caracteristicas
		
		Celular Cel2 = new Celular();
		Cel2.id=2;
		Cel2.modelo="Huawey Y6II";
		Cel2.precio=500f;
		
		System.out.println("Datos registrados");
		System.out.println(Cel2.toString());
		
	}
	
}
