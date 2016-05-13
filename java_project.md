# Package Table
## Alumni
## Orgnization
## Company
## School
# Package Operation
## Insert
	Insert.company(Company company) 返回 int
	!!调用此函数前先用Search.companyCheck(String name)函数查询是否数据库中已经存在这个名字的company!!
	传一个Company给我，给你返回int类型的company存在数据库里的id。
	如果返回－1 和 －2， 那就说明插入出错了。
	

	Insert.school(School school) 返回 int
	!!调用此函数前先用Search.schoolCheck(String name)函数查询是否数据库中已经存在这个名字的company!!
	传一个School给我，给你返回int类型的school存在数据库里的id。
	如果返回－1 和 －2， 那就说明插入出错了。
	
	Insert.alumni(Alumni alumni) 返回 int
	!!调用此函数前先用Search.alumniCheck(String studentID)函数查询是否数据库中已经存在这个studentid的学生!!
	传一个Alumni给我，给你返回int类型的alumni存在数据库里的(与公司或学校对应的)id。
	如果返回－1 和 －2， 那就说明插入出错了。
	
## Search
	Search.companyCheck(String name) 返回 int
	传一个公司的名字给我，如果此名字的数据已经存在数据库中，返回该公司在数据库里的id。
	如果返回－1，说明数据库中还没有这个公司的数据。
	如果返回－2，说明sql啥的出错了。
	
	Search.schoolCheck(String name) 返回 int
	传一个学校的名字给我，如果此名字的数据已经存在数据库中，返回该学校在数据库里的id。
	如果返回－1，说明数据库中还没有这个公司的数据。
	如果返回－2，说明sql啥的出错了。
	
	Search.alumniCheck(String studentID) 返回 int
	传一个同学的studentID给我，如果此studentID的数据已经存在数据库中，返回该同学在数据库里的(与公司或学校对应的)id。
	如果返回－1，说明数据库中还没有这个学生的数据。
	如果返回－2，说明sql啥的出错了。
	
	Search.alumni(String studentID) 返回 Alumni
	传一个同学的studentID给我，返回这个同学的object。
	
	Search.alumniState(String studentID) 返回 int
	传一个同学的studentID给我，返回这个同学的state。
	如果返回－1，说明数据库中还没有这个学生的数据。
	如果返回－2，说明sql啥的出错了。
	
	Search.alumniID(String studentID) 返回 int
	传一个同学的studentID给我，返回这个同学的state。
	如果返回－1，说明数据库中还没有这个学生的数据。
	如果返回－2，说明sql啥的出错了。
	
	Search.orgnization(int id, int state) 返回 orgnization
	传一个ID和state给我，返回对应的学校或公司。
	如果返回 null，说明出错了，或者没有对应机构 。
	Search.orgnization(String studentID) 返回 orgnization
	传一个学生studentID给我，返回对应的学校或公司。
	如果返回 null，说明没有对应机构。
	
	Search.school(String name, String country, String city, int top100) return School[]
	
	传一些 条件给我， 返回对应满足的学校的信息，以学校的数组的形式。
	如果返回 null，说明出错了。
	
	
	
