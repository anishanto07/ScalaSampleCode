import scala.io.Source

object HelloWorldScala {
	def main(args: Array[String]) {

		val filename = "C:/Users/poojar745/Documents/Handson/scala/scalaText.txt"
				val bufferedSource = Source.fromFile(filename)
				print("Timestamp")
					for (a <- 1 to 20){
							print(" ")
					}
		    print("|")
				println("Description")
				bufferedSource.getLines.foreach(line => {

					if(line contains "Error"){
						println("")
						print(line.substring(20,48))
						print(" | ")
						println(line.substring(48,70))
						for (a <- 1 to 55)
							print("-")
					} 

				})

	}
}

