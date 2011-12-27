{
 :default
 {
  :use-pipeline true
  :run-triggers true
  :print
  {
   :actions true
   :request false
   }
  }

 :test
 {
  :print
  {
   :request false
   }
  }
 
 :development
 {
  :print
  {
   :request true
   }
  }

 :production
 {
  :print
  {
   :request false
   }
  }
 }
