package com.tobias.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.tobias.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento{

	private static final long serialVersionUID = 1L;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dataVenciemento;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
		
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estato, Pedido pedido, Date dataVenciemento, Date dataPagamento) {
		super(id, estato, pedido);
		this.dataVenciemento = dataVenciemento;
		this.dataPagamento = dataPagamento;
	}

	public Date getDataVenciemento() {
		return dataVenciemento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataVenciemento(Date dataVenciemento) {
		this.dataVenciemento = dataVenciemento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
}
