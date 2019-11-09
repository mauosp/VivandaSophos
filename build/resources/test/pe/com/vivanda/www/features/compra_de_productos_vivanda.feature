@tag
Feature: Compra de producto en vivanda
  El usuario desea ingresar a la pagina de vivanda y agregar un producto al carrito de compras

  @buy
  Scenario: Agregar producto al carrito de compra
    Given El usuario ingresa a la pagina de Vivanda
    And Ingresa el nombre del producto a buscar vino blanco
    When Agrega el producto al carrito de compras
    Then Se visualiza el producto en el carrito de compras
    