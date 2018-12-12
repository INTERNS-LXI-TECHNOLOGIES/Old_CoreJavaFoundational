class Containers {
	
	constructor() {
		
		try {

			this.contactListContainer = $("#contactListContainer")[0];
			this.contactDetailContainer = $("#contactDetailContainer")[0];
			this.otherContainers = $(".otherContainers");
			this.buttonContainer = $("#buttonContainer")[0];
			this.createContactContainer = $("#createContactContainer")[0];
			this.settingsContainer = $("#settingsContainer")[0];

			if(this.contactListContainer == null) throw new Error("Cannot Find Element contactListContainer");
			else if(this.contactDetailContainer == null) throw new Error("Cannot Find Element contactDetailContainer");
			else if(this.buttonContainer == null) throw new Error("Cannot Find Elemet buttonContainer");
			else if(this.settingsContainer == null) throw new Error("Cannot find Elements settingsContainer");
			else if(this.createContactContainer == null) throw new Error("Cannot find Elements id createContactC..");
			else if(this.otherContainers.length <= 0) throw new Error("Cannot find Elements otherContainers")

		} catch (error) {
			
			alert(error);
		}
	}
} 



class ContactList {

	constructor() {

		ContactDetails.getTemplate();
		this.contactListContainer = new Containers().contactListContainer;
		this.jsonString = "";
	}

	set jsonStr(_jsonString) {

		this.jsonString = _jsonString;
	}

	parseData() {

		this.jsonData = JSON.parse(this.jsonString);

		if(this.jsonData == null) {

			throw new Error("Unable to parse JSON data");
		}
	}
	
	createList() {

		let color = ["green" , "blue" , "red" , "magenta"];

		let template = document.getElementsByClassName("contactListTemplate")[0];

		template.remove();
		
		if(this.jsonData != null) {
		
			for(let json of this.jsonData) {

				let node = template.cloneNode(true);

				let nameNode = node.getElementsByClassName("name")[0];
				let numberNode = node.getElementsByClassName("number")[0];
				let firstLetter = node.getElementsByClassName("firstLetter")[0];

				firstLetter.innerHTML = "<h4 class='text-center'>" + json.name[0].toUpperCase() + "</h4>";
				firstLetter.setAttribute("style" , "background-color:" + color[Math.floor(Math.random() * 3) + 1])
				nameNode.innerText = json.name;	
				numberNode.innerText = json.mobileNo;

				node.addEventListener("click" , ()=>{

					ContactDetails.showDetails(json);

				});

				this.contactListContainer.appendChild(node);
			}
		} 
		else {
			
			throw new Error("JsonData is not initialized : call parseData()");
		}
	}
	
}

class ContactDetails {
	
	static getTemplate() {

		ContactDetails.template = new Containers().contactDetailContainer.cloneNode(true);

	}

	static showDetails(_json) {

		try {
			
			let name = $(".dataName")[0];
			let mobile = $(".dataMobileNo")[0];
			let landline = $(".dataLandLine")[0];

			mobile.parentElement.style.display = "block";
			landline.parentElement.style.display = "block";

			let backBtn = $(".back")[0];

			new Containers().contactDetailContainer.style.display = "block";
			new Containers().contactListContainer.style.display = "none";

			name.innerText = _json.name

			if(_json.mobileNo) mobile.innerHTML = _json.mobileNo;
			else mobile.parentElement.style.display = "none";
		
			if(_json.mobileNo) mobile.innerHTML = _json.mobileNo;
			else mobile.parentElement.style.display = "none";

			if(_json.landLine) landline.innerHTML = _json.landLine;
			else landline.parentElement.style.display = "none";

			backBtn.addEventListener("click" , ()=>{

				new Containers().contactDetailContainer.style.display = "none";
				new Containers().contactListContainer.style.display = "block";
			});

		} catch (error) {
			alert(error);
		}

	}
}

class ButtonAction {

	constructor() {

		this.createContactBtn = $("#createContactBtn")[0];

		this.editBtn = $(".edit")[0];

		this.settingsBtn = $("#settingsBtn")[0];
	}

	static createButton() {

		let button = document.createElement("button");
		
		return button;
	}


	static display(showContainer) {

		let containers = new Containers();

		let container = $("#" + showContainer)[0];

		let buttonContainer = containers.buttonContainer;

		let otherContainers = containers.otherContainers;
		
		for(let elm of otherContainers) {

			if(elm == container) {

				elm.style.display = "block";
				
				if(elm != buttonContainer) {

					let button = ButtonAction.createButton();

					button.innerText = "Back";

					button.addEventListener("click" , ()=>
					{
						ButtonAction.display("buttonContainer");

						button.remove();
					})

					elm.appendChild(button);				
				}

			}else {
		
				elm.style.display = "none";
			}
		}

	}

	initializeHandlers() {

		var a = this.containers;

		this.createContactBtn.addEventListener("click" , ()=>{

			ButtonAction.display("createContactContainer");
		});

		this.settingsBtn.addEventListener("click" , ()=>{

			ButtonAction.display("settingsContainer");
		});

		this.editBtn.addEventListener("click" , ()=>{

			Contact.editContact($("#contactDetailContainer")[0].getAttribute("contactId"))

		});

	}


}

class Contact {

	static editContact(id) {

		let contact = new JavaBinder().getContactById(id);

		
		
	}
}


class JavaBinder {

	getJsonData() {

		return app.getJsonData();
	}

	createContact(_jsonString) {


	}

	getContactById(id) {

		
	}
}

class ContactApp {
	
	constructor() {
		
		var jbinder = new JavaBinder();
		var clist = new ContactList();
		var btnActions = new ButtonAction();


		clist.jsonStr = jbinder.getJsonData();
		clist.parseData();
		clist.createList();
		btnActions.initializeHandlers();
	}
}


