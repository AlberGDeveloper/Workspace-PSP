package javaBean;

import java.util.ArrayList;

public class MainJavaBean {

	public static void main(String[] args) {

		Persona p1 = new Persona();
		p1.setNombre("Son Goku");
		p1.setEdad(40);
		p1.setAltura(1.73);
		System.out.println(p1.getEdad());
		String direccion = "Calle Padul 2, Madrid, 28041";
		Direccion d1 = new Direccion();
		p1.setDireccion(d1);
		// p1.getDireccion().setNombreCalle("Namek");
		d1.setCiudad("namek");
		System.out.println(p1.getDireccion().getCiudad());
		p1.getDireccion().setCodPostal("25456");
		System.out.println(d1.getCodPostal());

		p1.setDireccion(new Direccion());
		p1.getDireccion().setCiudad("Kaito");

		System.out.println(d1.getCiudad());
		System.out.println(p1.getDireccion().getCiudad());

		ArrayList<Persona> ListaPersona = new ArrayList<Persona>();
		Persona p2 = new Persona();
		ListaPersona.add(p2);
		p2.setNombre("Krillin");
		System.out.println(ListaPersona);
		ListaPersona.get(0).setNombre("Pikolo");
		System.out.println(p2.getNombre());
		Persona p3 = p2;
		p3.setNombre("Ten Shin Han");
		System.out.println(ListaPersona.get(0).getNombre());
		Direccion d2 = new Direccion();
		p2.setDireccion(d2);
		ListaPersona.get(0).getDireccion().setNombreCalle("Via Lactea");
		System.out.println(p2.getDireccion().getNombreCalle());
		ListaPersona.get(0).getDireccion().setNombreCalle("Planeta Veggeta");
		p2.getDireccion().setCiudad("Planeta Vegeta");
		d2.setCiudad("Vegeta");
		p3.getDireccion().setCiudad("Planeta Vegeta");
		d2 = new Direccion();
		d2.setCiudad("Universo 9");
		//p3.setDireccion(null);
		//System.out.println(p2.getDireccion().getNombreCalle());
		String s1 = "Pepe";
		String s2 = new String ("Pepe");
		String s3 = "Pepe";
		System.out.println(s3);
		
		if (p2==p3){
			System.out.println("son iguales");
		}else {
			System.out.println("Son diferentes");
		}
	}

}
