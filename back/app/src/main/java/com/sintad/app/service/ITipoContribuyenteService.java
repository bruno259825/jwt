package com.sintad.app.service;
import java.util.List;

import com.sintad.app.vo.ResponseVO;
import com.sintad.app.vo.TipoContribuyenteVo;

public interface ITipoContribuyenteService {

	
	public ResponseVO<TipoContribuyenteVo> getTipoContribuyente(int id) throws Exception;
	
	public ResponseVO<TipoContribuyenteVo> createTipoContribuyente(TipoContribuyenteVo tipoContribuyente) throws Exception;
}
