package com.sforce.soap.enterprise.sobject;/** * Generated by ComplexTypeGenerator.java. Please do not edit. */public class Vote extends com.sforce.soap.enterprise.sobject.SObject {  /**   * Constructor   */  public Vote() {  }        /**   * element  : CreatedBy of type {urn:sobject.enterprise.soap.sforce.com}User   * java type: com.sforce.soap.enterprise.sobject.User   */  private static final com.sforce.ws.bind.TypeInfo CreatedBy__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedBy","urn:sobject.enterprise.soap.sforce.com","User",0,1,true);  private boolean CreatedBy__is_set = false;  private com.sforce.soap.enterprise.sobject.User CreatedBy;  public com.sforce.soap.enterprise.sobject.User getCreatedBy() {    return CreatedBy;  }    public void setCreatedBy(com.sforce.soap.enterprise.sobject.User CreatedBy) {    this.CreatedBy = CreatedBy;    CreatedBy__is_set = true;  }    /**   * element  : CreatedById of type {urn:enterprise.soap.sforce.com}ID   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo CreatedById__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedById","urn:enterprise.soap.sforce.com","ID",0,1,true);  private boolean CreatedById__is_set = false;  private java.lang.String CreatedById;  public java.lang.String getCreatedById() {    return CreatedById;  }    public void setCreatedById(java.lang.String CreatedById) {    this.CreatedById = CreatedById;    CreatedById__is_set = true;  }    /**   * element  : CreatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime   * java type: java.util.Calendar   */  private static final com.sforce.ws.bind.TypeInfo CreatedDate__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);  private boolean CreatedDate__is_set = false;  private java.util.Calendar CreatedDate;  public java.util.Calendar getCreatedDate() {    return CreatedDate;  }    public void setCreatedDate(java.util.Calendar CreatedDate) {    this.CreatedDate = CreatedDate;    CreatedDate__is_set = true;  }    /**   * element  : IsDeleted of type {http://www.w3.org/2001/XMLSchema}boolean   * java type: java.lang.Boolean   */  private static final com.sforce.ws.bind.TypeInfo IsDeleted__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true);  private boolean IsDeleted__is_set = false;  private java.lang.Boolean IsDeleted;  public java.lang.Boolean getIsDeleted() {    return IsDeleted;  }    public void setIsDeleted(java.lang.Boolean IsDeleted) {    this.IsDeleted = IsDeleted;    IsDeleted__is_set = true;  }    /**   * element  : Parent of type {urn:sobject.enterprise.soap.sforce.com}sObject   * java type: com.sforce.soap.enterprise.sobject.SObject   */  private static final com.sforce.ws.bind.TypeInfo Parent__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Parent","urn:sobject.enterprise.soap.sforce.com","sObject",0,1,true);  private boolean Parent__is_set = false;  private com.sforce.soap.enterprise.sobject.SObject Parent;  public com.sforce.soap.enterprise.sobject.SObject getParent() {    return Parent;  }    public void setParent(com.sforce.soap.enterprise.sobject.SObject Parent) {    this.Parent = Parent;    Parent__is_set = true;  }    /**   * element  : ParentId of type {urn:enterprise.soap.sforce.com}ID   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo ParentId__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","ParentId","urn:enterprise.soap.sforce.com","ID",0,1,true);  private boolean ParentId__is_set = false;  private java.lang.String ParentId;  public java.lang.String getParentId() {    return ParentId;  }    public void setParentId(java.lang.String ParentId) {    this.ParentId = ParentId;    ParentId__is_set = true;  }    /**   * element  : SystemModstamp of type {http://www.w3.org/2001/XMLSchema}dateTime   * java type: java.util.Calendar   */  private static final com.sforce.ws.bind.TypeInfo SystemModstamp__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true);  private boolean SystemModstamp__is_set = false;  private java.util.Calendar SystemModstamp;  public java.util.Calendar getSystemModstamp() {    return SystemModstamp;  }    public void setSystemModstamp(java.util.Calendar SystemModstamp) {    this.SystemModstamp = SystemModstamp;    SystemModstamp__is_set = true;  }    /**   * element  : Type of type {http://www.w3.org/2001/XMLSchema}string   * java type: java.lang.String   */  private static final com.sforce.ws.bind.TypeInfo Type__typeInfo =    new com.sforce.ws.bind.TypeInfo("urn:sobject.enterprise.soap.sforce.com","Type","http://www.w3.org/2001/XMLSchema","string",0,1,true);  private boolean Type__is_set = false;  private java.lang.String Type;  public java.lang.String getType() {    return Type;  }    public void setType(java.lang.String Type) {    this.Type = Type;    Type__is_set = true;  }    /**   */  public void write(javax.xml.namespace.QName __element,      com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)      throws java.io.IOException {    __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());    __typeMapper.writeXsiType(__out, "urn:sobject.enterprise.soap.sforce.com", "Vote");    writeFields(__out, __typeMapper);    __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());  }  protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {   super.writeFields(__out, __typeMapper);    __typeMapper.writeObject(__out, CreatedBy__typeInfo, CreatedBy, CreatedBy__is_set);    __typeMapper.writeString(__out, CreatedById__typeInfo, CreatedById, CreatedById__is_set);    __typeMapper.writeObject(__out, CreatedDate__typeInfo, CreatedDate, CreatedDate__is_set);    __typeMapper.writeObject(__out, IsDeleted__typeInfo, IsDeleted, IsDeleted__is_set);    __typeMapper.writeObject(__out, Parent__typeInfo, Parent, Parent__is_set);    __typeMapper.writeString(__out, ParentId__typeInfo, ParentId, ParentId__is_set);    __typeMapper.writeObject(__out, SystemModstamp__typeInfo, SystemModstamp, SystemModstamp__is_set);    __typeMapper.writeString(__out, Type__typeInfo, Type, Type__is_set);  }  public void load(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {    __typeMapper.consumeStartTag(__in);    loadFields(__in, __typeMapper);    __typeMapper.consumeEndTag(__in);  }  protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,      com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {   super.loadFields(__in, __typeMapper);    __in.peekTag();    if (__typeMapper.isElement(__in, CreatedBy__typeInfo)) {      setCreatedBy((com.sforce.soap.enterprise.sobject.User)__typeMapper.readObject(__in, CreatedBy__typeInfo, com.sforce.soap.enterprise.sobject.User.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, CreatedById__typeInfo)) {      setCreatedById((java.lang.String)__typeMapper.readString(__in, CreatedById__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, CreatedDate__typeInfo)) {      setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, CreatedDate__typeInfo, java.util.Calendar.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, IsDeleted__typeInfo)) {      setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, IsDeleted__typeInfo, java.lang.Boolean.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, Parent__typeInfo)) {      setParent((com.sforce.soap.enterprise.sobject.SObject)__typeMapper.readObject(__in, Parent__typeInfo, com.sforce.soap.enterprise.sobject.SObject.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, ParentId__typeInfo)) {      setParentId((java.lang.String)__typeMapper.readString(__in, ParentId__typeInfo, java.lang.String.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, SystemModstamp__typeInfo)) {      setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, SystemModstamp__typeInfo, java.util.Calendar.class));    }    __in.peekTag();    if (__typeMapper.isElement(__in, Type__typeInfo)) {      setType((java.lang.String)__typeMapper.readString(__in, Type__typeInfo, java.lang.String.class));    }  }  public String toString() {    java.lang.StringBuilder sb = new java.lang.StringBuilder();    sb.append("[Vote ");    sb.append(super.toString());    sb.append(" CreatedBy=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedBy)+"'\n");    sb.append(" CreatedById=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedById)+"'\n");    sb.append(" CreatedDate=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(CreatedDate)+"'\n");    sb.append(" IsDeleted=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(IsDeleted)+"'\n");    sb.append(" Parent=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(Parent)+"'\n");    sb.append(" ParentId=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(ParentId)+"'\n");    sb.append(" SystemModstamp=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(SystemModstamp)+"'\n");    sb.append(" Type=");    sb.append("'"+com.sforce.ws.util.Verbose.toString(Type)+"'\n");    sb.append("]\n");    return sb.toString();  }}