{
 :default
 {
  :use-pipeline true
  :run-triggers true
  :http
  {
   :port 8080
   }
  :print
  {
   :actions true
   :matchers false
   :predicates false
   :request false
   :routes false
   }
  :triggers
  {
   :thread-count 1
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
