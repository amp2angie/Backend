 create_tables.sql
CREATE TABLE IF NOT EXISTS Paciente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    apellido VARCHAR(255),
    nombre VARCHAR(255),
    dni VARCHAR(10),
    fecha_ingreso DATE,
    domicilio_id INT,
    telefono VARCHAR(20),
    email VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Domicilio (
    id INT AUTO_INCREMENT PRIMARY KEY,
    calle VARCHAR(255),
    numero INT,
    localidad VARCHAR(255),
    provincia VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Odontologo (
    numero_matricula INT PRIMARY KEY,
    nombre VARCHAR(255),
    apellido VARCHAR(255)
);