@Basic - for default values
@Transient - not getting persisted
@Temporal - for either date or time
@Lob - large objects for more than 255 characters
@GeneratedValue - gives out value automatically


AUTO (default): Tells Doctrine to pick the strategy that is preferred by the used database platform. The preferred strategies are IDENTITY for MySQL, SQLite and MsSQL and SEQUENCE for Oracle and PostgreSQL. This strategy provides full portability.

SEQUENCE: Tells Doctrine to use a database sequence for ID generation. This strategy does currently not provide full portability. Sequences are supported by Oracle and PostgreSql.

IDENTITY: Tells Doctrine to use special identity columns in the database that generate a value on insertion of a row. This strategy does currently not provide full portability and is supported by the following platforms:

MySQL/SQLite => AUTO_INCREMENT
MSSQL => IDENTITY
PostgreSQL => SERIAL
TABLE: Tells Doctrine to use a separate table for ID generation. This strategy provides full portability. This strategy is not yet implemented!

NONE: Tells Doctrine that the identifiers are assigned, and thus generated, by your code. The assignment must take place before a new entity is passed to EntityManager#persist. NONE is the same as leaving off the @GeneratedValue entirely.



@Embedded - @Embeddable for objects embeded from same table
@EmbeddedId







Queries
Why @Basic is used??
@Entity (name=) can be mentioned as table name.
difference between @Entity and @Table??