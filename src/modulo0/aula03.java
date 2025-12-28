void main() {

    var nomeItem1 = "Refresco do Chaves";
    var descricaoItem1 = "Suco de limão que parece de tamarindo e tem gosto de groselha.";
    var emPromocaoItem1 = false;
    var precoItem1 = 2.99;
    var idItem1 = 1L;
    var categoriaItem1 = 4;

    var nomeItem2 = "Sanduíche de Presunto do Chaves";
    var descricaoItem2 = "Sanduíche de presunto simples, mas feito com muito amor.";
    var emPromocaoItem2 = true;
    var precoItem2 = 3.50;
    var precoComDescontoItem2 = 2.99;
    var idItem2 = 3_000_000_000L;
    int categoriaItem2 = 2;

   /*
    categorias
	1 - Entradas
	2 - Pratos Principais
	3 - Sobremesas
	4 - Bebidas
   */

    IO.println("Nome: " + nomeItem1);


    if (categoriaItem1 == 1) {
        IO.println("Categoria: Entradas");
    } else if (categoriaItem1 == 2) {
        IO.println("Categoria: Pratos Principais");
    } else if (categoriaItem1 == 3) {
        IO.println("Categoria: Sobremesas");
    } else if (categoriaItem1 == 4) {
        IO.println("Categoria: Bebidas");
    } else {
        IO.println("Categoria não encontrada...");
    }

    IO.println("-------");

    switch(categoriaItem1) {
        case 1:
            IO.println("Categoria: Entradas");
        case 2:
            IO.println("Categoria: Pratos Principais");
            break;
        case 3:
            IO.println("Categoria: Sobremesas");
            break;
        case 4:
            IO.println("Categoria: Bebidas");
            break;
        default:
            IO.println("Categoria não encontrada...");
    }
}
