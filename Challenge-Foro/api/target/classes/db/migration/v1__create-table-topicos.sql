
CREATE TABLE topicos (
  id SERIAL NOT NULL PRIMARY KEY,  -- Use SERIAL for automatic increment
  titulo VARCHAR(100) NOT NULL,
  mensaje VARCHAR(100) NOT NULL,  -- Consider TEXT for potentially longer messages
  fecha VARCHAR(100) NOT NULL,  -- Use DATE data type for dates
  status BOOLEAN NOT NULL,
  nombre VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  contrasena VARCHAR(100) NOT NULL,
  nombreCurso VARCHAR(100) NOT NULL,
  categoria VARCHAR(100) NOT NULL

);
