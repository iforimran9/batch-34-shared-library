def call(String name){
	def now = new Date()
	def date = now.format("yyyy-mm-dd")
	def time = now.format("HH:mm:ss")

	def template = libraryResource('index.html')

	template = template 
		.replace('${name}', name)
		.replace('${date}', date)
		.replace('${time}', time)

	writeFile file: 'index.html', text: template

	echo "Template fle updated for ${name} at ${date} ${time}"
}
