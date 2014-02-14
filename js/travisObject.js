/**
 * 
 */

var travisObject = function() {
	//console.log("Hello world 2!!");
	this.baseObject = undefined;
};

travisObject.prototype.convertToJSON = function(myThingToConvert)
{
	var tJSON = $.parseJSON(myThingToConvert);
	return tJSON;
}

travisObject.prototype.log = function(myItem)
{
	console.log(myItem)
}

travisObject.prototype.runTest = function()
{
	console.log("Testing function.");
	var tJSON = '{"gID":"a8305016-d787-4eb7-b7ef-d69d9be8dbe8","startDate":1384959600000,"endDate":1384959600000,"eventDotTitle":"no title","percentageOfStart":0.0,"percentageOfEnd":0.0,"eventTypeDotTypeID":2,"iconID":0,"overrideColor":"NONE","property":[{"gID":"e2db09a7-c479-4522-bd8d-3fdb05cfc858","propertyTypeSubDotTypeID":1,"quantity":1.0,"defaultColor":"009933","name":"Closer to an Hour","link":"none","priority":0,"visible":true},{"gID":"2738b264-bc38-4cdd-a04e-b46ced8491e8","propertyTypeSubDotTypeID":3,"quantity":1.0,"defaultColor":"FFC2F0","name":"One","link":"none","priority":0,"visible":true}]}';
	
	var myData = $.parseJSON(tJSON);
	this.baseObject = myData;

};

travisObject.prototype.runTest2 = function(littleParameter)
{
	
	
	console.log(littleParameter);
	//console.log(myData.gID);
};

travisObject.prototype.returnDictionaryJSON = function()
{
	
	return this.baseObject;
};

travisObject.prototype.getArbitraryParameter = function(parameter)
{
	console.log(this.baseObject[parameter]);
	return this.baseObject[parameter];
};

//wrappedObjectType.prototype.getWrappedObjectType = function() {