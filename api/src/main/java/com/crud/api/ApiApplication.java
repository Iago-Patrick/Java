package com.crud.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.crud.api.repositorio.RepoPessoa;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner{

	private RepoPessoa RepoPessoa;

	public ApiApplication(RepoPessoa RepoPessoa)
	{
		this.RepoPessoa=RepoPessoa;
	}

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'run'");
	}

}
