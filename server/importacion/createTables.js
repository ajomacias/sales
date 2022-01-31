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
    tables.map((item)=>{
        client.query(item.sql);
        console.log(item.sql);
    })
    
}catch(err){
    console.log(err)

}