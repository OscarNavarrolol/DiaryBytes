CREATE DATABASE general_contacts;

USE general_contacts;

CREATE TABLE users (
    id_user INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password_user VARCHAR(255) NOT NULL
);

CREATE TABLE contacts (
    id_contact INT AUTO_INCREMENT PRIMARY KEY,
    name_contact VARCHAR(50) NOT NULL,
    phone_number VARCHAR(12) NOT NULL,
    address VARCHAR(60),
    email VARCHAR(30)
);

CREATE TABLE user_contacts (
    userxcontact_id INT primary key auto_increment,
    id_contact INT,
    id_user int
);

alter table user_contacts add foreign key(id_contact) references contacts(id_contact);

alter table user_contacts add foreign key(id_user) references users(id_user);


INSERT INTO users (username, password_user) VALUES 
('usuario1', 'contraseña1'),
('usuario2', 'contraseña2'),
('usuario3', 'contraseña3');

INSERT INTO contacts (name_contact, phone_number, address, email) VALUES 
('Contacto 1', '1234567890', '123 Calle Principal', 'contacto1@example.com'),
('Contacto 2', '9876543210', '456 Avenida Secundaria', 'contacto2@example.com'),
('Contacto 3', '5551234567', '789 Carretera', 'contacto3@example.com');

-- Asignar contactos a usuarios existentes
INSERT INTO user_contacts (id_contact, id_user) VALUES 
(1, 1),  
(2, 2),  
(3, 3); 











