//Get all the cards as screenshots
//Maybe than add random noise?
//First get all the 
import java.net.URL;

fun main (args: Array<String){
	val url = "http://blog.fefe.de"
	val obj = URL(url)
	with(obj.openConnection() as HttpURLConnection) {
	        // optional default is GET
	        requestMethod = "GET"


	        println("\nSending 'GET' request to URL : $url")
	        println("Response Code : $responseCode")

	        BufferedReader(InputStreamReader(inputStream)).use {
	            val response = StringBuffer()

	            var inputLine = it.readLine()
	            while (inputLine != null) {
	                inputLine = it.readLine()
	                response.append(inputLine)
	            }
	            println(response.toString())
	        }
		}
}