package br.com.aula5;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		LocalDate datalocal = LocalDate.now();
		LocalDate novaDataLocal = LocalDate.of(2020, 10, 31);
		
		//Duration novoPeriodo = Duration.between(datalocal, novaDataLocal);
		
		LocalDate valor = LocalDate.of(2020, 8,31);
		
		
		System.out.println(datalocal.getDayOfYear());
		DateTimeFormatter valorFormatado = DateTimeFormatter.ISO_DATE;
		
		
		String datalocal1 = datalocal.format(valorFormatado);
		System.out.println(datalocal1);
		
		LocalDateTime novaData = LocalDateTime.now();
		
		System.out.println(datalocal.isAfter(novaDataLocal));
		System.out.println(datalocal.isBefore(novaDataLocal));
		System.out.println(datalocal.isEqual(novaDataLocal));
		
		datalocal = datalocal.plusDays(2);
		datalocal = datalocal.minusDays(30);
		datalocal = datalocal.minusMonths(2);
		
		//System.out.println(novoPeriodo.toDays());
		System.out.println(ChronoUnit.DAYS.between(datalocal, novaDataLocal));
		
		
		
		List<Nome> nomes = new ArrayList<>();
		
		Nome mario = new Nome("Mario");
		Nome fabio = new Nome("Fabio");
		Nome gustavo = new Nome("Gustavo");
		Nome wilson = new Nome("Wilson");
		nomes.add(mario);
		nomes.add(fabio);
		nomes.add(gustavo);
		nomes.add(wilson);
		
		System.out.println(nomes.get(1).getNome());
		
		System.out.println(nomes.contains(new Nome("Gustavo")));
		
		nomes.remove(1);
		
		nomes.forEach(nome -> System.out.println(nome.getNome()));
		
		
		Set<String> produtos = new HashSet<>();
		
		produtos.add("Macaxeira");
		produtos.add("Inhame");
		produtos.add("Morango");
		
		System.out.println(produtos.contains("Morango"));
		System.out.println(produtos.contains("morango"));
		System.out.println(produtos.size());
		

		System.out.println(produtos.add("morango"));
		System.out.println(produtos.size());
		
		produtos.remove("morango");
		
		System.out.println(produtos.size());
		
		for(String produto: produtos) {
			System.out.println(produto);
		}

		Set<Nome> nomes = new HashSet<>();
		
		Nome mario = new Nome("Mario");
		Nome fabio = new Nome("Mario");
		nomes.add(mario);
		nomes.add(fabio);
		
		for(Nome nome: nomes) {
			System.out.println(nome.getNome());
		}
		
		*/
		
		Map<Integer, String> jogos = new HashMap<>();
		
		jogos.put(1, "Donkey Kong Jr");
		jogos.put(2, "Fall Guys");
		jogos.put(3, "Valorant");
		jogos.put(4, "Fall Guys");
		//jogos.put(4, "LoL");
		
		System.out.println(jogos.get(4));
		
		//System.out.println(jogos.remove(4));
		
		System.out.println(jogos.get(4));
		
		for(Integer chave: jogos.keySet()) {
			String valor = jogos.get(chave);
			System.out.println(valor);
		}
		
		
	}
}
