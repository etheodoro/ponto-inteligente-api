package com.etheodoro.pontointeligente.api.services;

import java.util.Optional;

import com.etheodoro.pontointeligente.api.entities.Empresa;

public interface EmpresaService {

	/**
	 * Busca e retorna uma empresa pelo cnpj
	 * 
	 * @param cnpj
	 * @return
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Persiste uma empresa na base de dados
	 * 
	 * @param empresa
	 * @return
	 */
	Empresa persistir(Empresa empresa);
	
}
