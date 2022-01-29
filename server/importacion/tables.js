exports.tables = 
    `

CREATE TABLE IF NOT EXISTS public.categoriaproveedor
(
id_categoriaproveedor serial NOT NULL,
    nombre_categoriaproveedor character varying(40) UNIQUE NOT NULL,
    detalle_categoriaproveedor text NOT NULL,
    CONSTRAINT categoriaproveedor_pk PRIMARY KEY (id_categoriaproveedor)
);

CREATE TABLE IF NOT EXISTS public.proveedor
(
    id_proveedor serial NOT NULL,
    id_categoriaproveedor integer UNIQUE NOT NULL,
    cedula_proveedor character varying(10) UNIQUE NOT NULL,
    direccion_proveedor character varying(170) NOT NULL,
    telefono_proveedor character varying(12) UNIQUE NOT NULL,
    email_proveedor character varying(120) UNIQUE NOT NULL,
    banco_proveedor character varying(20) UNIQUE NOT NULL,
    cuenta_proveedor character varying(30) UNIQUE NOT NULL,
    detalle_proveedor text NOT NULL,
    estado_proveedor character varying(10) NOT NULL,

    CONSTRAINT proveedor_pk PRIMARY KEY (id_proveedor),
    CONSTRAINT categoria_proveedor FOREIGN KEY (id_categoriaproveedor)
    REFERENCES categoriaproveedor(id_categoriaproveedor)
    ON DELETE CASCADE
);	



`