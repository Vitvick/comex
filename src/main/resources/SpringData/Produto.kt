package SpringData

class Produto {

    id int not null auto_increment primary key,
    nome varchar(100) not null,
    descricao varchar(100) not null,
    preco double not null,
    fabricante int not null,
    FOREIGN KEY (fabricante) REFERENCES fabricante(id) ON DELETE CASCADE
    )
}