import animals.Dog
import music.Song
import space.Planet

fun main() {
    val doggo = Dog(name = "Doggo", weight = 30, breed = "doggy-doggo")
    val puppy = Dog(name = "Pal", weight = 18, breed = "terrier")

    val mercury = Planet(
        name = "Mercury",
        type = "Terrestrial",
        position = 1,
        isHabitable = false
    )

    val venus = Planet(
        name = "Venus",
        type = "Terrestrial",
        position = 2,
        isHabitable = false
    )

    val earth = Planet(
        name = "Earth",
        type = "Terrestrial",
        position = 3,
        isHabitable = true
    )

    val mars = Planet(
        name = "Mars",
        type = "Terrestrial",
        position = 4,
        isHabitable = false
    )

    val jupiter = Planet(
        name = "Jupiter",
        type = "Gas Giant",
        position = 5,
        isHabitable = false
    )

    val saturn = Planet(
        name = "Saturn",
        type = "Gas Giant",
        position = 6,
        isHabitable = false
    )

    val uranus = Planet(
        name = "Uranus",
        type = "Gas Giant",
        position = 7,
        isHabitable = false
    )

    val neptune = Planet(
        name = "Neptune",
        type = "Gas Giant",
        position = 8,
        isHabitable = false
    )

    val solarSystem = arrayOf(mercury, venus, earth, mars, jupiter, saturn, uranus, neptune)

    val outsider = Song(title = "Outsider", artiste = "Eve")
    val bokurano = Song(title = "Bokurano", artiste = "Eve")
    val idol = Song(title = "Idol", artiste = "Yoasobi")

    val playlist = arrayOf(outsider, bokurano, idol)

    println(doggo.bark())
    println(puppy.bark())

    println(doggo.run {
        "$name is a cute $breed that weighs about ${weightInKgs}kg"
    })

    println("\nPlanet ${earth.name} is ${if (earth.isHabitable) "habitable" else "not habitable"}")
    println("Planet ${mars.name} is ${if (mars.type.lowercase() != "terrestrial") "a gas giant" else "terrestrial"}")
    println("Planet ${jupiter.name} is a ${jupiter.type.lowercase()}\n")

    for (planet in solarSystem) {
        println("${planet.position}. ${planet.name}")
    }

    println("\n- SONGS -")

    for ((index, song) in playlist.withIndex()) {
        println("${index+1}. ${song.title} by ${song.artiste}")
    }
}