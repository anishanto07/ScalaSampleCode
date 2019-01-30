import scala.io.Source
import java.io.File
import java.io.PrintWriter


object HelloWorldScala {
  def main(args: Array[String]) {

    val filename = "C:/Users/anish745/Documents/Handson/scala/scalaText.txt"
    
    val writer = new PrintWriter(new File("C:/Users/anish745/Documents/Handson/scala/scalaText.txt"))

    val bufferedSource = Source.fromFile(filename)
    print("Timestamp")
    writer.write("Timestamp")
    for (a <- 1 to 20) {
      print(" ")
      writer.write(" ")
    }
    print("|")
    writer.write("|")
    writer.write("Description")
    println("Description")
    bufferedSource.getLines.foreach(line => {

      if (line contains "Error") {
        println("")
        writer.write("\r\n")
        print(line.substring(20, 48))
        writer.write("\r\n" + line.substring(20, 48))
        print(" | ")
        writer.write("|")
        println(line.substring(48, 70))
        writer.write(line.substring(48, 70))
        writer.write("\r\n")
        for (a <- 1 to 55) {
          print("-")
          writer.write("-")
        }
      }
    })
    writer.close()

  }
}

