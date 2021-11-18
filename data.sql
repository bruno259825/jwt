

INSERT INTO `tb_tipo_contribuyente` VALUES ('1', '', 'Natural Sin Negocio');
INSERT INTO `tb_tipo_contribuyente` VALUES ('2', '', 'Juridica');
INSERT INTO `tb_tipo_contribuyente` VALUES ('3', '', 'Natural Con Negocio');
INSERT INTO `tb_tipo_contribuyente` VALUES ('4', '', 'No Domiciliado');

-- ----------------------------
-- Records of tb_tipo_documento
-- ----------------------------
INSERT INTO `tb_tipo_documento` VALUES ('1', '4', 'CARNET DE EXTRANJERIA', ' ' ,'CARNET DE EXTRANJERIA');
INSERT INTO `tb_tipo_documento` VALUES ('2', '7', 'PASAPORTE',' ' , 'PASAPORTE');
INSERT INTO `tb_tipo_documento` VALUES ('3', '11', 'PARTIDA DE NACIMIENTO - IDENTIDAD',' ' , 'PARTIDA DE NACIMIENTO - IDENTIDAD');
INSERT INTO `tb_tipo_documento` VALUES ('4', '99', 'OTROS', ' ' ,'OTROS');
INSERT INTO `tb_tipo_documento` VALUES ('5', '6', 'RUC', ' ' ,'REGISTRO UNICO DEL CONTRIBUYENTE');
INSERT INTO `tb_tipo_documento` VALUES ('6', '1', 'DNI', ' ' ,'DOCUMENTO NACIONAL DE IDENTIDAD');

-- ----------------------------
-- Records of tb_entidad
-- ----------------------------
INSERT INTO `tb_entidad`(id_entidad,id_tipo_documento,nro_documento,razon_social,nombre_comercial,id_tipo_contribuyente,direccion,telefono,estado) VALUES ('1', '3', '20505327552', 'SYL S.A.C', 'SYL CARGO NOMBRE COMERCIAL', '1', 'Jr. Comandante Jimenez Nro. 166 Int. a (entre Cuadra 7 y 8 Javier Padro Oeste)', '79845612', '');
INSERT INTO `tb_entidad`(id_entidad,id_tipo_documento,nro_documento,razon_social,nombre_comercial,id_tipo_contribuyente,direccion,telefono,estado) VALUES ('2', '3', '20543844838', 'PUNTUAL EXPRESS S.A.C.', '', '1', 'MZA. F LOTE. 29 AS.RSD.MONTECARLO II LIMA - LIMA - SAN MARTIN DE PORRE', '', '');
INSERT INTO `tb_entidad`(id_entidad,id_tipo_documento,nro_documento,razon_social,nombre_comercial,id_tipo_contribuyente,direccion,telefono,estado) VALUES ('3', '3', '10410192999', 'ALVAREZ MACHUCA RENZO GUSTAVO', '', '3', 'AV. LOS ALISOS MZA. G LOTE. 05 ASC. LA ALBORADA DE OQUENDO III ETAPA (CRUCE PTE OQUENDO CON AV.NESTOR GAMBETTA) PROV. CONST. DEL CALLAO - PROV. CONST. DEL CALLAO - CALLAO', '', '');
INSERT INTO `tb_entidad`(id_entidad,id_tipo_documento,nro_documento,razon_social,nombre_comercial,id_tipo_contribuyente,direccion,telefono,estado) VALUES ('4', '3', '20600131037', 'CARNICOS MAFER S.A.C.', '', '2', 'CAL.EL UNIVERSO NRO. 327 URB. LA CAMPIÑA ZONA CINCO (ALTURA ', '', '');
INSERT INTO `tb_entidad`(id_entidad,id_tipo_documento,nro_documento,razon_social,nombre_comercial,id_tipo_contribuyente,direccion,telefono,estado) VALUES ('5', '3', '20556528218', 'SUMAQUINARIA S.A.C.', '', '2', 'AV. M.SUCRE NRO. 455 DPTO. 603 LIMA - LIMA - MAGDALENA DEL MAR', '', '');
INSERT INTO `tb_entidad`(id_entidad,id_tipo_documento,nro_documento,razon_social,nombre_comercial,id_tipo_contribuyente,direccion,telefono,estado) VALUES ('6', '3', '20545412528', 'OASIS FOODS S.A.C.', '', '2', 'CAL. FRANCISCO MASIAS NRO. 370 URB. SAN EUGENIO (PISO 7) LIM', '', '');
INSERT INTO `tb_entidad`(id_entidad,id_tipo_documento,nro_documento,razon_social,nombre_comercial,id_tipo_contribuyente,direccion,telefono,estado) VALUES ('7', '3', '20510620195', 'INVERSIONES PRO3 SAC', '', '2', 'AV. AUTOPIDTA RAMIRO PRIALE LOTE. 02 A.V. PROP HUERTOS DE HU', '', '');
INSERT INTO `tb_entidad`(id_entidad,id_tipo_documento,nro_documento,razon_social,nombre_comercial,id_tipo_contribuyente,direccion,telefono,estado) VALUES ('8', '3', '20498383361', 'REPUESTOS DAVID DIESEL E.I.R.L.', '', '2', 'CAR.VIA EVITAMIENTO MZA. 857 LOTE. 7 SEC. IRRIGACION EL CURAL 1 AREQUIPA - AREQUIPA - CERRO COLORADO', '', '');
INSERT INTO `tb_entidad`(id_entidad,id_tipo_documento,nro_documento,razon_social,nombre_comercial,id_tipo_contribuyente,direccion,telefono,estado) VALUES ('9', '6', 'CNAH00003', 'ANHUI HAYVO PROTECTIVE PRODUCT MANUFACTURING CO.,LTD', '', '4', '173 FENGLE AVENUE,ECNOMIC DEVELOPMENT ZONE,QUANJIAO COUNTY', '', '');
