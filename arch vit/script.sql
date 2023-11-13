CREATE DATABASE general_contacts;

USE general_contacts;

CREATE TABLE contacts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name_contact VARCHAR(50) NOT NULL,
    phone_number VARCHAR(12) NOT NULL,
    address VARCHAR(60),
    email VARCHAR(30)
);

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password_user VARCHAR(255) NOT NULL,
    contact_id INT
);

ALTER TABLE users ADD FOREIGN KEY (contact_id) REFERENCES contacts(id);

INSERT INTO contacts (name_contact, phone_number, address, email)
VALUES 
    ('Pedro', '31322132321', 'Calle 33 el estoral', 'Quesitoq@'),
    ('Claus', '3132213222', 'Calle 11 el litoral', 'lancer@'),
    ('Lina', '31234354', 'Calle 13 carnerp', 'asdq@');

INSERT INTO users (username, password_user, contact_id)
VALUES
    ('user1', 'password1', 1),
    ('user2', 'password2', 2),
    ('user3', 'password3', 3);

SELECT * FROM contacts;
