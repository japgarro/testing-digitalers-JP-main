CREATE TABLE bicicletas (
  codigo INT NOT NULL AUTO_INCREMENT,
  marca VARCHAR(100) NOT NULL,
  modelo VARCHAR(100) NOT NULL,
  color VARCHAR(50) NOT NULL,
  tipo_bicicleta INT NOT NULL,
  año_fabricacion YEAR NULL,
  PRIMARY KEY (codigo)
);
CREATE TABLE tipo_bicicleta (
  codigo INT NOT NULL,
  descripcion VARCHAR(50) NOT NULL,
  PRIMARY KEY (codigo)
);
CREATE TABLE clientes (
  codigo INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  apellido VARCHAR(100) NOT NULL,
  telefono VARCHAR(15) NULL,
  dni VARCHAR(10) NOT NULL,
  domicilio VARCHAR(255) NOT NULL,
  codigo_bicicleta INT NOT NULL,
  PRIMARY KEY (codigo),
  FOREIGN KEY (codigo_bicicleta) REFERENCES bicicletas (codigo)
);
INSERT INTO bicicletas (marca, modelo, color, tipo_bicicleta, año_fabricacion)
VALUES ('Trek', 'Marlin 5', 'Azul', 1, 2023);
SELECT * FROM tipo_bicicleta;
SELECT * FROM clientes;
select * from bicicletas;
DELETE FROM bicicletas WHERE codigo = 1;
select * from bicicletas;

ALTER TABLE bicicletas
MODIFY tipo_bicicleta VARCHAR(50) NOT NULL;


INSERT INTO bicicletas (marca, modelo, color, tipo_bicicleta, año_fabricacion)
	VALUES ('Firebird', 'Marlin 5', 'Blanco', "Paseo", 2020);
	
select * from bicicletas;
DELETE FROM bicicletas WHERE codigo = 2;
DELETE FROM bicicletas WHERE codigo = 3;
DELETE FROM bicicletas WHERE codigo = 4;
DELETE FROM bicicletas WHERE codigo = 5;
select * from bicicletas;
INSERT INTO bicicletas (marca, modelo, color, tipo_bicicleta, año_fabricacion)
	VALUES ('Firebird', 'Marlin 5', 'Blanco', "Paseo", 2020);
INSERT INTO bicicletas (marca, modelo, color, tipo_bicicleta, año_fabricacion)
	VALUES ('Firebird', 'Other 4', 'Blanco', "Montaña", 2021);
INSERT INTO bicicletas (marca, modelo, color, tipo_bicicleta, año_fabricacion)
	VALUES ('Venzo', 'Lisa 2', 'Blanco', "Carrera", 2020);
select * from bicicletas;
INSERT INTO tipo_bicicleta ( codigo, descripcion)
	values ('1', 'Bicicleta nueva');
select * from tipo_bicicleta;
DELETE FROM tipo_bicicleta WHERE codigo = 0;
select * from tipo_bicicleta;
INSERT INTO clientes (nombre, apellido, telefono, dni, domicilio, codigo_bicicleta)
VALUES
  ('Juan', 'Perez', '123456789', '1234567890', 'Calle 123', 6), 
  ('Maria', 'Gonzalez', NULL, '0987654321', 'Avenida 456', 7), 
  ('Carlos', 'Lopez', '987654321', '5678901234', 'Carrera 789', 8); 

select * from tipo_bicicleta;
DELETE FROM tipo_bicicleta WHERE codigo = 1;
select * from tipo_bicicleta;
INSERT INTO tipo_bicicleta ( codigo, descripcion)
	values ('1', 'Paseo');
INSERT INTO tipo_bicicleta ( codigo, descripcion)
	values ('2', 'Montaña');
INSERT INTO tipo_bicicleta ( codigo, descripcion)
	values ('3', 'Carrera');
SELECT
  c.nombre AS Nombre,
  c.apellido AS Apellido,
  b.marca AS Marca_Bicicleta,
  b.modelo AS Modelo_Bicicleta,
  tb.descripcion AS Descripcion_Tipo_Bicicleta
FROM clientes AS c
JOIN bicicletas AS b ON c.codigo_bicicleta = b.codigo
JOIN tipo_bicicleta AS tb ON b.tipo_bicicleta = tb.codigo;