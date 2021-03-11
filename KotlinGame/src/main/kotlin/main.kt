fun main(args: Array<String>) {
    val taif = Player("Taif", 4 , 1, 0)

    taif.show()

    val baksteen = Weapon( "baksteen", 15)

    taif.weapon = baksteen

    println(taif.weapon)
    println(taif.weapon.damageInflicted)

    val saad = Player("Saad", 4, 3,0)
    saad.weapon = Weapon("Dikke Doekoe", 20)

    taif.weapon = saad.weapon

    //println(taif.weapon.name)

    taif.show()
}