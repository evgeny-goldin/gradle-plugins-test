
var fs     = require( 'fs' )
var http   = require( 'http' )
var config = JSON.parse( fs.readFileSync( 'config/development.json', 'ascii' ))
var port   = config.port

http.createServer( function ( req, res ) {
  res.writeHead( 200, { 'Content-Type': 'text/plain' })
  res.end( 'hello-js|' + config.key1 + '|' + config.key2 + '|' + config.a.b.c.d.e + '|' + config.a.b.c.m.p.y )
}).listen( port, '127.0.0.1' )

console.log( 'Server running at http://127.0.0.1:' + port + '/' )
