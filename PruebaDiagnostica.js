(function(){
    var App = {
        Data:{
            cadena: undefined,
            identificador: undefined

        },
        Methods: {
            init: function(cadenini,identificadorini){
                cadena = cadenini;
                identificador = identificadorini;
                App.Methods.initExceptions();
                
                if (cadena.length > 0 && cadena.length < 11) {

                    return App.Methods.conversion();

                } else {
                    
                    throw new App.Exceptions.UserExcepction("La cadena debe ser de un tamaño entre 1 y 10 caracteres.");
                }
            },
            initExceptions: function()
            {
                App.Exceptions.UserExcepction.prototype.toString = function(){
                    
                    return `${this.message}`;
                };
            },
            conversion: function()
            {
                switch(identificador) {
        
                    case 0: 
                        // let buff = new Buffer(cadena)
                        // let base64data = new Buffer(cadena).toString('base64');
                        // console.log(base64data);
                    return  new Buffer.from(cadena).toString('base64');
        
                    case 1:
        
                    return App.Methods.rot13(cadena);
                        
                    case 2:
                        // let bufStr = Buffer.from(str, 'utf8');
                        // return bufStr.toString('hex');
                    return  Buffer.from(cadena, 'utf8').toString('hex');
        
                    case 3:
                        
                    return App.Methods.stringToBinary(cadena);
        
        
                }

            },
            rot13: function(str){

                var re = new RegExp("[a-z]", "i");
                var min = 'A'.charCodeAt(0);
                var max = 'Z'.charCodeAt(0);
                var factor = 13;
                var result = "";
                str = str.toUpperCase();
                
                for (var i=0; i<str.length; i++) {
                  result += (re.test(str[i]) ?
                    String.fromCharCode((str.charCodeAt(i) - min + factor) % (max-min+1) + min) : str[i]);
                }
                
                return result;
              
            },
            stringToBinary: function(str,spaceSeparatedOctets) {
                function zeroPad(num) {
                    return "00000000".slice(String(num).length) + num;
                }
            
                return str.replace(/[\s\S]/g, function(str) {
                    str = zeroPad(str.charCodeAt().toString(2));
                    return !1 == spaceSeparatedOctets ? str : str + " ";
                });
           }
        },
        Exceptions:{
            UserExcepction: function(message){
                this.message = message;
            }
         }
    }; 
    console.log(App.Methods.init("Este es un",0));
})();


