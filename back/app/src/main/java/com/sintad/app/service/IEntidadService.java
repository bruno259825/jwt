package com.sintad.app.service;

import java.util.List;

import com.sintad.app.vo.EntidadVo;
import com.sintad.app.vo.ResponseVO;
import com.sintad.app.vo.TipoContribuyenteVo;
import com.sintad.app.vo.TipoDocumentoVo;

public interface IEntidadService {

	public ResponseVO<EntidadVo> getEntidad(int id) throws Exception;

	public ResponseVO<TipoContribuyenteVo> getTipoContribuyente(int id) throws Exception;

	public ResponseVO<List<EntidadVo>> getEntidades() throws Exception;

	public ResponseVO<TipoDocumentoVo> getTipoDocumento(int id) throws Exception;

	public void deleteEntidad(int id) throws Exception;
	
}
