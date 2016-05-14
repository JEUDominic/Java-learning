# Package Table
## Alumni
	int sex;  1 是男生, 0 是女生
## Orgnization
## Company
	int top100; 1 是是top100, 0 是不是top100;
## School
# Package Operation
## Insert
	Insert.company(Company company) 返回 int
	!!调用此函数前先用Validation.companyCheck(String name)函数查询是否数据库中已经存在这个名字的company!!
	传一个Company给我，给你返回int类型的company存在数据库里的id。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－4，插入失败。
	

	Insert.school(School school) 返回 int
	!!调用此函数前先用Validation.schoolCheck(String name)函数查询是否数据库中已经存在这个名字的company!!
	传一个School给我，给你返回int类型的school存在数据库里的id。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－4，插入失败。	
	
	Insert.alumni(Alumni alumni) 返回 int
	!!调用此函数前先用Validation.alumniCheck(String studentID)函数查询是否数据库中已经存在这个studentid的学生!!
	传一个Alumni给我，给你返回int类型的alumni存在数据库里的(与公司或学校对应的)id。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－4，插入失败。	
	
## Validation
	
	Validation.companyCheck(String name) 返回 int
	传一个公司的名字给我，如果此名字的数据已经存在数据库中，返回该公司在数据库里的id。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－4，说明在数据库中找不到对应数据。
	
	Validation.schoolCheck(String name) 返回 int
	传一个学校的名字给我，如果此名字的数据已经存在数据库中，返回该学校在数据库里的id。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－4，说明在数据库中找不到对应数据。
	
	Validation.alumniCheck(String studentID) 返回 int
	传一个同学的studentID给我，如果此studentID的数据已经存在数据库中，返回该同学在数据库里的(与公司或学校对应的)id。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－4，说明在数据库中找不到对应数据。
	
	Validation.yearCheck(int year) 返回 int
	传如年份，检测是否合法（－1 或者 在2008和2016之间）。
	如果返回1，说明年份在2008和2016之间。
	如果返回0，说明传入的是－1.
	如果返回－1，说明传入的年份非法。
	
## Search
	
	Search.alumni(String studentID) 返回 Alumni
	传一个同学的studentID给我，返回这个同学的object。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－4，说明在数据库中找不到对应数据。
	
	Search.alumniState(String studentID) 返回 int
	传一个同学的studentID给我，返回这个同学的state。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－4，说明在数据库中找不到对应数据。
	
	Search.alumniID(String studentID) 返回 int
	传一个同学的studentID给我，返回这个同学的state。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－4，说明在数据库中找不到对应数据。
	
	Search.orgnization(int id, int state) 返回 orgnization
	传一个ID和state给我，返回对应的学校或公司。
	如果返回 null，说明出错了，或者没有对应机构 。
	Search.orgnization(String studentID) 返回 orgnization
	传一个学生studentID给我，返回对应的学校或公司。
	如果返回 null，说明没有对应机构。
	
	Search.school(String name, String country, String city, int top100) 返回 School[])
	传一些 条件给我， 返回对应满足的学校的信息，以学校的数组的形式。
	如果返回 null，说明出错了，或者没有对应学校。
	
	Search.oversea(int state, int id) 返回int
	传入状态state(1或2)和id给我，返回这个机构是不是在海外。
	如果返回1，说明在海外。
	如果返回0，说明在国内。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－4，说明在数据库中找不到对应数据。
	如果返回－3，说明state不是1也不是2，非法输入。
	
	Search.top100(int id) 返回int
	传入学校的id，返回他是不是top100。
	如果返回1，说明这个学校是top100。
	如果返回0，说明这个学校不是top100。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－4，说明在数据库中找不到对应数据。
	
## Count

	Count.company(int oversea, int year) 返回int
	传入参数 int china（1的时候说明是在国外，0的时候说明是在海外,-1的时候说明不在乎是否是国外）。
	传入参数int year（－1的时候说明不在乎是哪一年）。
	返回符合条件的公司的数量。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－3，说明输入年份出错。
	如果返回－4，说明在数据库中找不到对应数据。
	
	Count.school(int oversea, int year) 返回int
	传入参数 int china，1的时候说明是在国外，0的时候说明是在海外,-1的时候说明不在乎是否是国外；
	传入参数int year（－1的时候说明不在乎是哪一年）。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－3，说明输入年份出错。
	如果返回－4，说明在数据库中找不到对应数据。
	
	Count.home(int year) 返回int
	传入参数int year（－1的时候说明不在乎是哪一年）。
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－3，说明输入年份出错。
	如果返回－4，说明在数据库中找不到对应数据。
	
	Count.top100(int top100) 返回int
	传入参数int top100，1说明要top100，0说明不要top100
	如果返回－1，说明类出错。
	如果返回－2，说明sql出错。
	如果返回－3，说明输入年份出错。
	如果返回－4，说明在数据库中找不到对应数据。
	
	
	
