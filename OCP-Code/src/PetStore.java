import java.util.ArrayList;

public class PetStore {
	private ArrayList<Pet> pets = new ArrayList<Pet>();
	
	public void sounds() {
		for (Pet pet : pets) {
			if (pet.petType == PetType.CAT)
				System.out.println("Meow");
			else if (pet.petType == PetType.DOG)
				System.out.println("Woof");
		}	
		System.out.println() ;
	}
	
	public void treats() {
		for (Pet pet : pets) {
			if (pet.petType == PetType.CAT)
				System.out.println("Give " + pet.petName + " some catnip");
			else if (pet.petType == PetType.DOG)
				System.out.println("Give " + pet.petName + " a bone");			
		}
		System.out.println() ;
	}
	
	public void fun() {
		for (Pet pet : pets) {
			if (pet.petType == PetType.CAT)
				System.out.println("Watch " + pet.petName + " sleep");
			else if (pet.petType == PetType.DOG)
				System.out.println("Throw a frisbee to " + pet.petName);			
		}	
		System.out.println() ;
	}
	
	public void addPet( Pet pet ) {
		pets.add( pet ) ;
	}

	public void listPets() {
		for( Pet pet : pets ) {
			System.out.println(pet);
		}
	}
	
	public static void main(String[] args) {
		PetStore myStore = new PetStore() ;
		
		myStore.addPet(new Pet("Buttons", PetType.CAT ));
		myStore.addPet(new Pet("Boxer", PetType.DOG ));
		myStore.addPet(new Pet("Dax", PetType.CAT ));
		
		myStore.fun();
		myStore.treats();
		myStore.sounds();
		
	}

}
