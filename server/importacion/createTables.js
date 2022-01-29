const { Client } = require("pg");
const {tables} = require("./tables")
try{
const client = new Client({
    user:"postgres",
    host:"localhost",
    database:"ventas",
    password:"0981942117",
    port:5432
});

client.connect()
    client.query(tables)
console.log("Se crearon las tablas correctamente")
    
}catch(err){
    console.log(err)

}