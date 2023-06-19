package music

class Song(val title: String, val artiste: String) {
    fun play() {
        println("Playing \"$title\" by $artiste...")
    }

    fun stop() {
        println("Stopped playing $title.")
    }
}