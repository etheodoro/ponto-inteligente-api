package com.etheodoro.pontointeligente.api.services.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etheodoro.pontointeligente.api.entities.Funcionario;
import com.etheodoro.pontointeligente.api.repositories.FuncionarioRepository;
import com.etheodoro.pontointeligente.api.services.FuncionarioService;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	private static final Logger log = LoggerFactory.getLogger(FuncionarioServiceImpl.class);
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Override
	public Funcionario persistir(Funcionario funcionario) {
		log.info("Persistindo Funcionario {}", funcionario);
		return this.funcionarioRepository.save(funcionario);
	}

	@Override
	public Optional<Funcionario> buscaPorCpf(String cpf) {
		log.info("Buscando Funcionario pelo cpf {}", cpf);
		return Optional.ofNullable(this.funcionarioRepository.findByCpf(cpf));
	}

	@Override
	public Optional<Funcionario> buscaPorEmail(String email) {
		log.info("Buscando Funcionario pelo email {}", email);
		return Optional.ofNullable(this.funcionarioRepository.findByEmail(email));
	}
	
	 @Override
	public Optional<Funcionario> buscaPorId(Long id) {
		log.info("Buscando Funcionario pelo id {}", id);
		return this.funcionarioRepository.findById(id);
	}

}
