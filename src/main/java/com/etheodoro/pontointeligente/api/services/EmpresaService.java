package com.etheodoro.pontointeligente.api.services;

import java.util.Optional;

import com.etheodoro.pontointeligente.api.entity.Empresa;

public interface EmpresaService {

	/**
	 * Busca e retorna uma empresa pelo cnpj
	 * 
	 * @param cnpj
	 * @return
	 */
	Optional<Empresa> buscaPorCnpj(String cnpj);
	
	/**
	 * Persiste uma empresa na base de dados
	 * 
	 * @param empresa
	 * @return
	 */
	Empresa persistir(Empresa empresa);
	
}
