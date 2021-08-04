package oops_assign2

class Person(val name : String, val age : Int) extends Ordered[Person] {
  override def compare(that: Person): Int = {
    if(this.name == that.name)
      this.age - that.age
    else
      this.name.length - that.name.length
  }
}


object Person extends App {
    val person_1= new Person("Candidate_One", 15)
    val person_2= new Person("Candidate", 15)
    val person_3 = new Person("Candidate", 15)
    val person_4 = new Person("Candidate", 15)

    def compareObject(personOne: Person, personTwo: Person): Unit = {
      if (personOne.compare(personTwo) > 0)
        println(true)
      else println(false)
    }
    compareObject(person_1,person_2)
    compareObject(person_3,person_4)

}
