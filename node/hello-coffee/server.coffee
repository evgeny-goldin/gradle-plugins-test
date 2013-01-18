fs     = require( 'fs' )
http   = require( 'http' )
config = JSON.parse( fs.readFileSync( 'config/development.json', 'ascii' ))
port   = config.port

http.createServer(( req, res ) ->
  res.writeHead 200, 'Content-Type': 'text/plain'
  res.end 'Hello World - coffee\n'
).listen port, '127.0.0.1'

console.log 'Server running at http://127.0.0.1:' + port + '/'