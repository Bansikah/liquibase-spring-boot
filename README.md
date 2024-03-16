## Liquibase Spring boot 🚀💻

- Helps in multiple database versions.
- It is an opensource

## Advantages

- Automatic updates
- Automatic creation and creation of roll backups.

  ## Supported formats
  - XML
  - JSON
  - SQL
  - YAML

    Changelog -> contains 1 or more change sets

## Change sets

A changedset describes a set of database that liquibase executes within one transaction.

To enable successful rollbacks and keep track of the executed changesets, each changeset is identifield by ``Àuthor name ``, `ìd`` (can  be any unique id like 1, 2, 3 or time stamp)

## Configuration

spring.liquibase.change-log=classpath:db/changelog/changelog-master.xml or yaml

check liquibase best practices Visit [link](liquibase.com)
