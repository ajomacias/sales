
CREATE TABLE categoriaproveedor
(
 id_categoriaproveedor serial NOT NULL UNIQUE,
 nombre_categoriaproveedor varchar(40) 	NOT NULL UNIQUE,
 detalle_categoriaproveedor text NOT NULL,
 CONSTRAINT categoriaproveedor_pk PRIMARY KEY (id_categoriaproveedor)
) 