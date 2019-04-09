package com.etheodoro.pontointeligente.api.services;

import java.util.Optional;

import com.etheodoro.pontointeligente.api.entity.Funcionario;

public interface FuncionarioService {

	/**
	 * Persiste um funcionario na base de dados
	 * 
	 * @param funcionario
	 * @return
	 * @throws Exception
	 */
	Funcionario persistir(Funcionario funcionario) throws Exception; 
	
	/**
	 * Busca e retorna um funcionaro pelo cpf
	 * 
	 * @param cpf
	 * @return
	 * @throws Exception
	 */
	Optional<Funcionario> buscaPorCpf(String cpf) throws Exception;
	
	/**
	 * Busca e retorna um funcionario pelo email 
	 * 
	 * @param email
	 * @return
	 * @throws Exception
	 */
	Optional<Funcionario> buscaPorEmail(String email) throws Exception;
	
	/**
	 * Busca e retorna um funcionario peli Id
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Optional<Funcionario> buscaPorId(Long id) throws Exception;
	
	
}
