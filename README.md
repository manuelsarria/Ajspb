# Ajspb
//se inicia el proyectecto de aplicacion de angulas js para aprender del mismo desde desarrolloweb.com   link actual 
(https://desarrolloweb.com/articulos/segundo-ejercicio-controller-angularjs.html)
(function (){
    var Module = {
        Data:{
            arr: undefined//,
            //: undefined
        },
        Methods:{
            initExceptions: function()
            {
                Module.Exceptions.UserExcepction.prototype.toString = function(){
                    
                    return `${this.message}`;
                };
            },
                init: function(arre){
                    Module.Data.arr = arre;
                    Module.Methods.initExceptions();
                    if (Module.Data.arr.length  < 1 )
                    {
 
                        throw new Module.Exceptions.UserExcepction("Debe de completar el arreglo");
                    }

                    
                    //console.log(Module.Validacion.validaArregloNum());
                    if (Module.Validacion.validaArregloNum())
                    {
 
                        throw new Module.Exceptions.UserExcepction("El Arreglo debe de tener solo número");
                    }
                    

                },
                cal: function(){
                    let sumatoria = 0;
                    for(let i = 0; i < Module.Data.arr.length; i +=1)
                    {
                        //console.log(Data.arr[i]);
                        sumatoria = Module.Data.arr[i]+sumatoria;
                    }
                    console.log('La sumatoria del Arreglo es '+sumatoria);
                }
                
        },
        Validacion:{
                validaArregloNum: function(){
                    
                    var find = false;
                    for(let i = 0; i < Module.Data.arr.length; i +=1)
                    {
                        if (!Number.isInteger(Module.Data.arr[i]) )
                        {
                            find = true;
                        }
                        
                    }

                    if (find)
                    {
                        return true;
                    }else 
                    {
                        return false;
                    }
                    
                }
        },
        Exceptions:{
            UserExcepction: function(message){
                this.message = message;
                this.date = new Date();
                this.nombre = 'UserException';
            }
         }
    }
    const enteros = [10,5,4,1,9,25];
    Module.Methods.init(enteros);
    Module.Methods.cal();
})();


// luego funcion mejorada 
(function(){  
  var Module = {
      Data:{
        
        array: undefined
      },
      Methods:{
        initExceptions: function()
        {
            Module.Exceptions.UserExcepction.prototype.toString = function(){

              return `${this.message}`;
            };
        },
        init: function(arrays){
          Module.Data.array = arrays;
          Module.Methods.initExceptions();
          if (Module.Data.array.lenght < 1){
            
            throw new Module.Exceptions.UserExcepction("el arrglo esta vacio");
          }

          if (Module.Validacion.ValidateArray()){
            throw new Module.Exceptions.UserExcepction("el arehlo solo debe contener numeros");
          }
        },
        cal: function(){
          let sumatoria = 0;
          for(let i=0;i < Module.Data.array.lenght;i++){

            sumatoria = Module.Data.array[i]+sumatoria;
          }
          console.log('La sumatoria del Arreglo es '+sumatoria);

        }
      },
      Validacion:{
        ValidateArray: function(){
          var find = false;
          for(let i = 0; i < Module.Data.array.lenght; i++)
          {
            if (!Number.isInteger(Module.Data.array[i]) )
            {
                find = true;
            }                
          }
          return find;
        }
      },
      Exceptions:{
        UserExcepction: function(message){
          this.message = message;
          this.date = new Date();
          this.nombre = 'UserException';
        }
      }
  }
  const entero = [];
  Module.Methods.init(entero);
  Module.Methods.cal();
})();
